package connection;

import java.io.File;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "datastax.astra")
public class DataStaxAstraProperties {

        private File secureConnectBundleFile;

        public File getSecureConnectBundleFile() {
            return secureConnectBundleFile;
        }

        public void setSecureConnectBundleFile(File secureConnectBundleFile) {
            this.secureConnectBundleFile = secureConnectBundleFile;
        }



}
