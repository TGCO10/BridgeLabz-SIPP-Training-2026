package GcrCodeBase.Interfaces.MultiServiceSmartTV;

interface StreamingService {
    void streamMovie();
    default void showSubscriptionDetails() {
        System.out.println("Streaming Service Subscription Active.");
    }
}