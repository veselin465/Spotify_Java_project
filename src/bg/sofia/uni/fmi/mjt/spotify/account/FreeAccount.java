package bg.sofia.uni.fmi.mjt.spotify.account;

import bg.sofia.uni.fmi.mjt.spotify.library.Library;

public class FreeAccount extends Account {

    private int adsListenedTo;

    public FreeAccount(String email, Library library) {
        super(email, library);
        adsListenedTo = 0;
    }

    @Override
    public int getAdsListenedTo() {
        return adsListenedTo;
    }

    @Override
    public AccountType getType() {
        return AccountType.FREE;
    }

    @Override
    public double getAccountPlatformRevenue() {
        return adsListenedTo * 0.10;
    }

}
