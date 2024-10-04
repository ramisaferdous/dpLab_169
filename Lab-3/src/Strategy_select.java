public class Strategy_select {
    private Encryption strategy;

    public void set_Strategy(Encryption strategy) {
        this.strategy = strategy;
    }

    public String encryptData(String data) throws Exception {
        return strategy.encrypt(data);
    }

    public String decryptData(String encryptedData) throws Exception {
        return strategy.decrypt(encryptedData);
    }
}
