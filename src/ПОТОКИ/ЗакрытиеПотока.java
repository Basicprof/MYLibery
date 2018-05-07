import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;



public class ЗакрытиеПотока   extends Thread {
        private static final int BUFFER_SIZE = 2000;    //2000 bytes
        private final Socket socket;
        private final InputStream in;

        public ЗакрытиеПотока(Socket socket) throws IOException {
            this.socket = socket;
            this.in = socket.getInputStream();
        }

        public void interrupt() {
            try {
                socket.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                super.interrupt();
            }
        }

        public void run() {
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                while (true) {
                    int count = in.read(buf);
                    if (count < 0) {
                        break;
                    } else {
                        if (count > 0) {
                            //process buffer here
                        }
                    }
                }
            } catch (IOException ignored) {}
        }

        public static void main(String[] args) {
        }
    }

