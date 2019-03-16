package Knowledge.Threads.LiveLock;

public class Police {
    private boolean moneySent = false;

    public void giveMoney(Criminal criminal) {
        while (!criminal.isHostageReleased()) {
            System.out.println("Police: waiting for criminal to release the hostage.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Police: Give money to criminal.");
        this.moneySent = true;
    }

    public boolean isMoneySent() {
        return this.moneySent;
    }
}
