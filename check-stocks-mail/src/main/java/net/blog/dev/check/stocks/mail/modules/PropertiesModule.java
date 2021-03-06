package net.blog.dev.check.stocks.mail.modules;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module(library = true)
public class PropertiesModule {

    @Provides
    @Named("stocks.codes")
    public String providesStocksCode() {
        return "^FCHI,SOLB,AF,VIRP,VCT,ALT,ICAD,ERF,BOL,NEX,ACA,MAU,ATO,RCF,RMS,RIN,MMT,DIM,UBI,TFI,FDR,ATE,RIA,SAF,IPS,DEC,GFT,AI,CGG,CA,CNP,FP,OR,VK,AC,EN,LG,NEO,SAN,CS,BN,KN,RI,NK,BB,MC,RF,EO,MF,SW,RUI,ML,HO,KER,UG,EI,SK,HAV,LI,SU,VIE,POM,UL,SGO,CAP,ING,DG,CO,ZC,VIV,ALU,MMB,FR,RCO,FGR,PUB,DSY,GLE,BNP,TEC,ERA,RNO,ORA,ORP,SOI,ILD,GNFT,TKTT,ELE,BVI,GFC,LOCAL,BIM,NXI,SAFT,GSZ,ALO,ETL,MERY,EDF,IPN,LR,AKE,ADP,KORI,SCR,RXL,GET,SEV,EDEN,TCH,AREVA,NUM,GTT,SESG,MT,APAM,STM,AIR,GTO";
    }

    @Provides
    @Named("stocks.codesCrypto")
    public String providesStocksCodeCrypto() {
        return "BTC,ETH";
    }

    @Provides
    @Named("stocks.dynamic.rsi.tolerance")
    public Double providesDynamicRsiTolerance() {
        String fromSystem = System.getenv("stocks.dynamic.rsi.tolerance");
        if (fromSystem == null)
            return 5d;
        return Double.parseDouble(fromSystem);
    }

    @Provides
    @Named("stocks.rule.check.code")
    public String providesCheckCode() {
        String fromSystem = System.getenv("stocks.rule.check.code");
        if (fromSystem == null)
            return "";
        return fromSystem;
    }
}
