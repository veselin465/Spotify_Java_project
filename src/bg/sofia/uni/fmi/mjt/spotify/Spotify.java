package bg.sofia.uni.fmi.mjt.spotify;

import bg.sofia.uni.fmi.mjt.spotify.account.Account;
import bg.sofia.uni.fmi.mjt.spotify.exceptions.AccountNotFoundException;
import bg.sofia.uni.fmi.mjt.spotify.exceptions.PlayableNotFoundException;
import bg.sofia.uni.fmi.mjt.spotify.exceptions.StreamingServiceException;
import bg.sofia.uni.fmi.mjt.spotify.playable.Playable;

public class Spotify implements StreamingService {

    private Account[] accounts;
    private Playable[] playableContent;

    public Spotify(Account[] accounts, Playable[] playableContent)
    {

        this.accounts = accounts;
        this.playableContent = playableContent;
        /*
        this.accounts = new Account[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            // this.accounts[i] = new Account(accounts[i]);
        }

        this.playableContent = new Playable[playableContent.length];
        for (int i = 0; i < playableContent.length; i++) {
            // this.playableContent[i] = new Playable(playableContent[i]);
        }*/

    }

    @Override
    public void play(Account account, String title) throws AccountNotFoundException, PlayableNotFoundException {
        if(account == null || title == null){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void like(Account account, String title) throws AccountNotFoundException, PlayableNotFoundException, StreamingServiceException {
        if(account == null || title == null){
            throw new IllegalArgumentException();
        }

        int accountIndex = -1;
        int playableContentIndex = -1;

        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i].equals(account)){
                accountIndex = i;
            }
        }

        if(accountIndex == -1){
            throw new AccountNotFoundException();
        }

        for (int i = 0; i < playableContent.length; i++) {
            if(playableContent[i].getTitle().equals(title)){
                playableContentIndex = i;
            }
        }

        if(playableContentIndex == -1){
            throw new PlayableNotFoundException();
        }

        //accounts[accountIndex].getLibrary().like(playableContent[playableContentIndex]);

    }

    @Override
    public Playable findByTitle(String title) throws PlayableNotFoundException {
        if(title == null){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < playableContent.length; i++) {
            if (playableContent[i].getTitle().equals(title)){
                return playableContent[i];
            }
        }
       throw new PlayableNotFoundException();
    }

    @Override
    public Playable getMostPlayed() {
        Playable mostPlayedContent = null;
        int mostPlayedTotalPlays = -1;
        for (int i = 0; i < playableContent.length; i++) {
            if (playableContent[i].getTotalPlays() > mostPlayedTotalPlays){
                mostPlayedTotalPlays = playableContent[i].getTotalPlays();
                mostPlayedContent = playableContent[i];
            }
        }
        return mostPlayedContent;
    }

    @Override
    public double getTotalListenTime() {
        double totalListenTime = 0;
        for (int i = 0; i < accounts.length; i++) {
            totalListenTime += accounts[i].getTotalListenTime();
        }
        return totalListenTime;
    }

    @Override
    public double getTotalPlatformRevenue() {
        double totalRevenue = 0;
        for (int i = 0; i < accounts.length; i++) {
            totalRevenue += accounts[i].getAccountPlatformRevenue();
        }
        return totalRevenue;
    }



}
