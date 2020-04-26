package org.btcdk.jni;

import org.junit.After;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * BtcDkService local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 * <p>
 * Must set environment variable: eg. (on osx)
 * export JAVA_LIBRARY_PATH=[project_home]/lib/src/main/jniLibs/x86_64
 **/
public class BtcDkServiceTest {

    private static String PASSPHRASE = "correct horse battery staple";
    private static String PD_PASSPHRASE_1 = "test123";
    private static String PD_PASSPHRASE_2 = "123test";

    private static List<String> MNEMONIC_WORDS = Arrays.asList("reason", "since", "adjust", "settle", "menu", "auction", "material", "beyond", "bomb", "repair", "appear", "length");
    private static String XPUB_KEY = "xpub661MyMwAqRbcGCNhNJWLH3CdBsVTo97ZVU8os3QhczR4R3ddekGD2e1PCWw15hnuRYoAnnz842ff9NCr35w3ZyF9FZC9nrbcJJbeGZxFAR8";

    private final BtcDkService btcDkService;

    private final Path workDir = Paths.get(".").toAbsolutePath();

    public BtcDkServiceTest() {
        btcDkService = new BtcDkService();
    }

    @Test
    public void btcdkLib_init_load_remove_config() {

        Optional<InitResult> inited = btcDkService.initConfig(workDir, Network.Regtest, PASSPHRASE, PD_PASSPHRASE_1);
        assertNotNull(inited);
        assertTrue(inited.isPresent());
        InitResult initResult = inited.get();
        assertEquals(initResult.getMnemonicWords().length, 12);
        assertNotNull(initResult.getDepositAddress());
        Optional<Config> loaded = btcDkService.loadConfig(workDir, Network.Regtest);
        assertNotNull(loaded);
        assertTrue(loaded.isPresent());
        Config config = loaded.get();
        assertEquals(config.getNetwork(), Network.Regtest);
        Optional<Config> removed = btcDkService.removeConfig(workDir, Network.Regtest);
        assertNotNull(removed);
        assertTrue(removed.isPresent());
    }

    @Test
    public void btcdkLib_init_update_remove_config() {

        Optional<InitResult> inited = btcDkService.initConfig(workDir, Network.Regtest, PASSPHRASE, PD_PASSPHRASE_1);
        assertNotNull(inited);
        assertTrue(inited.isPresent());
        InitResult initResult = inited.get();
        assertEquals(initResult.getMnemonicWords().length, 12);
        assertNotNull(initResult.getDepositAddress());
        Optional<Config> updated = btcDkService.updateConfig(workDir, Network.Regtest,
                new String[]{"127.0.0.1:18333", "10.0.0.10:18333"}, 3, true);
        assertNotNull(updated);
        assertTrue(updated.isPresent());
        Config config2 = updated.get();
        assertEquals(config2.getNetwork(), Network.Regtest);
        assertEquals(config2.getBitcoinPeers().length, 2);
        assertEquals(config2.getBitcoinPeers()[0], "127.0.0.1:18333");
        assertEquals(config2.getBitcoinPeers()[1], "10.0.0.10:18333");
        assertEquals(config2.getBitcoinConnections(), 3);
        assertTrue(config2.isBitcoinDiscovery());
        Optional<Config> removed = btcDkService.removeConfig(workDir, Network.Regtest);
        assertNotNull(removed);
        assertTrue(removed.isPresent());
    }

//    @Test
//    public void btcdkLib_start() {
//
//        BTCDKService.start(workDir, Network.Regtest, false);
//        System.out.println("Started!");
//    }

}