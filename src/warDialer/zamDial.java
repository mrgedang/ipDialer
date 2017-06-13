package warDialer;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class zamDial extends Thread {

    public int log;

    public synchronized static void bunuh() {
        exec("killall -9 wvdial");
        exec("killall -9 pppd");
    }

    public boolean cek_putar() {
        if (log > 19) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        String arra = zamDialFrame.arrIP;
        String arr[] = arra.split(",");
        boolean ketemu = false;
        zamDialFrame.txtLog.setText("");
        log = 0;
        do {
            if (cek_putar() == true) {
                zamDialFrame.txtLog.setText("");
                log = 0;
            }
            bunuh();
            if (zamDialFrame.Argue.isEmpty()) {
                exec("wvdial");
            } else {
                exec("wvdial " + zamDialFrame.Argue);
            }
            //System.out.println("Dikonekne sek dab, Entenono...");
            //zamDialFrame.txtLog.append("Dikonekne sek dab, Entenono...\n");
            zamDialFrame.txtLog.append("Nyobo[" + ((int) log + 1) + "] - ");
            do {
                try {
                    Thread.sleep(100);
                } catch (Exception ex) {
                }
            } while (cek() == false);
            //System.out.print("Wes Konek!");
            //zamDialFrame.txtLog.append("Wes Konek! ");
            try {
                Enumeration e = NetworkInterface.getNetworkInterfaces();
                while (e.hasMoreElements()) {
                    NetworkInterface ni = (NetworkInterface) e.nextElement();
                    if (ni.getName().equalsIgnoreCase("ppp0")) {
                        Enumeration e2 = ni.getInetAddresses();
                        while (e2.hasMoreElements()) {
                            InetAddress ip = (InetAddress) e2.nextElement();
                            //System.out.println("Ndelok IP ne...");
                            //zamDialFrame.txtLog.append("Ndelok IP ne...\n");
                            for (int i = 0; i < arr.length; i++) {
                                if (ip.toString().contains(arr[i])) {
                                    ketemu = true;
                                    //System.out.println("Ketemu! ==> [" + ip.toString() + "]\n");
                                    zamDialFrame.txtLog.append("Ketemu! ==> [" + ip.toString().replace("/", "") + "]\n");
                                    break;
                                }
                            }
                            if (ketemu == false) {
                                zamDialFrame.txtLog.append("Gagal! [" + ip.toString().replace("/", "") + "]\n");
                                bunuh();
                            }
                        }
                    }
                }
            } catch (Exception e) {
            }
            log++;
        } while (ketemu == false);
    }

    public synchronized static void exec(String cmd) {
        String ret = null;

        Runtime run = Runtime.getRuntime();
        Process pr = null;
        try {
            pr = run.exec(cmd);
        } catch (IOException e) {
        }

    }

    public synchronized static boolean cek() {
        boolean hasil = false;
        try {
            Enumeration e = NetworkInterface.getNetworkInterfaces();
            while (e.hasMoreElements()) {
                NetworkInterface ni = (NetworkInterface) e.nextElement();
                if (ni.getName().equalsIgnoreCase("ppp0")) {
                    hasil = true;
                }
            }
        } catch (Exception x) {
        }
        return hasil;
    }
}
