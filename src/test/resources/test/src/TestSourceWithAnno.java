package test.src;

import org.igov.io.log.DoNotReplaceTheLogs;
import org.igov.io.log.Logger;

@DoNotReplaceTheLogs
public class TestSourceWithAnno {
    void someMethod() {
        LOG.info("(sContent={})", sContent);
    }
}