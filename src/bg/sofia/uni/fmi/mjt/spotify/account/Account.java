package bg.sofia.uni.fmi.mjt.spotify.account;

import bg.sofia.uni.fmi.mjt.spotify.library.Library;
import bg.sofia.uni.fmi.mjt.spotify.playable.Playable;

public abstract class Account {

    private String email;
    private Library library;
    private double totalListenTime;

    public Account(String email, Library library) {
        this.email = email;
        // library = new Library(library);
        totalListenTime = 0;
    }

    /**
     * Returns the number of ads listened to.
     * - Free accounts get one ad after every 5 pieces of content played
     * - Premium accounts get no ads
     */
    public abstract int getAdsListenedTo();

    /**
     * Returns the account type as an enum with possible values FREE and PREMIUM
     */
    public abstract AccountType getType();

    /**
     * Returns the total revenue this account has made for the platform.
     * The platform makes money from each registered account:
     * - for FREE accounts, the revenue is 0.10 for every ad that has been played
     * - for PREMIUM accounts, the revenue is a one-time subscription of 25.00
     */
    public abstract double getAccountPlatformRevenue();

    /**
     * Simulates listening of the specified content.
     * This should increment the total number of content listened and the total listen time for this account.
     *
     * @param playable
     */
    public void listen(Playable playable) {
        totalListenTime += playable.getDuration();
        String result = playable.play();
        System.out.println(result);
    }

    /**
     * Returns the library for this account.
     */
    public Library getLibrary() {
        return library;
    }

    /**
     * Returns the total listen time for this account. The time for any ads listened is not included.
     */
    public double getTotalListenTime() {
        return totalListenTime;
    }




}
