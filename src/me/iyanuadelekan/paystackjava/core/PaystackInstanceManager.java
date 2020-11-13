package me.iyanuadelekan.paystackjava.core;

public class PaystackInstanceManager {
    /**
     * Contributed by Samuel Iwuchukwu to improve the time complexity of paystack
     * this class declares various classes in the Paystack api for java and then instantiates it once so there
     * wont be continous instantion each time it will be used
     */
    private static ApiConnection apiConnection = null;
    private static ApiQuery apiQuery = null;
    private static Customers customers = null;
    private static Keys keys = null;
    private static Pages pages = null;
    private static PaystackInline paystackInline = null;
    private static Plans plans = null;
    private static Subscriptions subscriptions = null;
    private static Transactions transactions = null;

    /**
     * this method create a singleton instance of ApiConnection class
     * @param url
     * @return
     */
    public static ApiConnection getApiConnection(String url){
        if(apiConnection == null){
            apiConnection = new ApiConnection(url);
        }

        return apiConnection;
    }

    /**
     * this method creates a single instance of ApiQuery class
     * @return
     */
    public static ApiQuery getApiQuery(){
        if(apiQuery == null){
            apiQuery = new ApiQuery();
        }
        return apiQuery;
    }

    /**
     * this method returns a singleton instance of Customers class
     * @return
     */
    public static Customers getCustomers(){
        if (customers == null){
            customers = new Customers();
        }

        return customers;
    }

    /**
     * this method is used to return a singleton instance of the keys class
     * @return
     */
    protected static Keys getKeys(){
        if (keys == null){
            keys = new Keys();
        }

        return keys;
    }

    /**
     * this is used to return a singleton instance of the Pages class
     * @return
     */
    public static Pages getPages(){
        if(pages == null){
            pages = new Pages();
        }

        return pages;
    }

    /**
     * this method returns a singleton instance of PaystackInline class
     * @return
     */
    public static PaystackInline getPaystackInline(){
        if (paystackInline == null){
            paystackInline = new PaystackInline();
        }

        return paystackInline;
    }

    /**
     * this method returns a singleton instance of Plans class
     * @return
     */
    public static Plans getPlans(){
        if (plans == null){
            plans = new Plans();
        }

        return plans;
    }

    /**
     * this method returns a singleton instance of Subscriptions class
     * @return
     */
    public static Subscriptions getSubscriptions(){
        if (subscriptions == null){
            subscriptions = new Subscriptions();
        }

        return subscriptions;
    }

    /**
     * this method returns a singleton instance of Transactions class
     * @return
     */
    public static Transactions getTransactions(){
        if (transactions == null){
            transactions = new Transactions();
        }

        return transactions;
    }


}
