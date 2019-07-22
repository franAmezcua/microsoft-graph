import main.MSClient;
import objects.MSGraphConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class ConfigurationTests {

    @Test
    public void loadMinimalConfigurationTest() {
        String testFileString = new File(getClass().getClassLoader().getResource("testMinimalConfig.yaml").getFile()).getAbsolutePath();
        MSGraphConfiguration configuration = (new MSClient(testFileString)).getConfiguration();
        Assert.assertNotEquals(null, configuration);

        Assert.assertEquals("sample-client-id",configuration.getAzureADClient().getClientId());
        Assert.assertEquals("sample-tenant-id",configuration.getAzureADClient().getTenantId());
        Assert.assertEquals("sample+client:secret*",configuration.getAzureADClient().getClientSecret());
        Assert.assertEquals(300 ,configuration.getAzureADClient().getPullInterval());

        Assert.assertEquals("sampleAccountToken",configuration.getLogzioSenderParameters().getAccountToken());
        Assert.assertEquals("https://listener.logz.io:8071", configuration.getLogzioSenderParameters().getListenerUrl());
        Assert.assertEquals(1000, configuration.getLogzioSenderParameters().getDiskSpaceCheckInterval());
    }

    @Test
    public void loadFullConfigurationTest() {
        String testFileString = new File(getClass().getClassLoader().getResource("testFullConfig.yaml").getFile()).getAbsolutePath();
        MSGraphConfiguration configuration = (new MSClient(testFileString)).getConfiguration();
        Assert.assertNotEquals(null, configuration);
        Assert.assertEquals("sample-client-id",configuration.getAzureADClient().getClientId());
        Assert.assertEquals("sample-tenant-id",configuration.getAzureADClient().getTenantId());
        Assert.assertEquals("sample+client:secret*",configuration.getAzureADClient().getClientSecret());
        Assert.assertEquals(600 ,configuration.getAzureADClient().getPullInterval());

        Assert.assertEquals("sampleAccountToken",configuration.getLogzioSenderParameters().getAccountToken());
        Assert.assertEquals("https://listener-eu.logz.io:8071", configuration.getLogzioSenderParameters().getListenerUrl());
        Assert.assertEquals(1000, configuration.getLogzioSenderParameters().getDiskSpaceCheckInterval());
        Assert.assertEquals(50000, configuration.getLogzioSenderParameters().getInMemoryQueueCapacityInBytes());
        Assert.assertEquals(10000, configuration.getLogzioSenderParameters().getLogsCountLimit());
        Assert.assertEquals(true, configuration.getLogzioSenderParameters().isDebug());
        Assert.assertEquals(false, configuration.getLogzioSenderParameters().isFromDisk());

    }


}
