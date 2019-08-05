package objects;

public class MSGraphConfiguration {
    private AzureADClient azureADClient;
    private LogzioJavaSenderParams senderParams;
    private String logLevel = "INFO";

    public MSGraphConfiguration() {
    }

    public void setAzureADClient(AzureADClient azureADClient) {
        this.azureADClient = azureADClient;
    }

    public AzureADClient getAzureADClient() {
        return azureADClient;
    }

    public LogzioJavaSenderParams getSenderParams() {
        return senderParams;
    }

    public void setSenderParams(LogzioJavaSenderParams senderParams) {
        this.senderParams = senderParams;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }
}
