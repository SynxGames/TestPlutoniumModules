package games.synx.modules.testapplication;

import games.synx.plutonium.common.application.impl.exception.ApplicationInitialisationException;
import games.synx.plutonium.common.application.type.ImplementationType;
import games.synx.plutonium.paper.impl.application.AbstractPaperApplication;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class TestApplication extends AbstractPaperApplication {

    @Autowired
    public TestApplication(Logger logger) throws ApplicationInitialisationException {
        super(ImplementationType.MODULE, logger);
    }

    @Override
    public ApplicationContext getApplicationContext() {
        return null;
    }

    @Override
    public void enable() {
        logger().info("YO!");
        logger().info("....................../´¯/)");
        logger().info("....................,/¯../");
        logger().info(".................../..../ ");
        logger().info("............./´¯/'...'/´¯¯`·¸ ");
        logger().info("........../'/.../..../......./¨¯\\ ");
        logger().info("........('(...´...´.... ¯~/'...') ");
        logger().info(".........\\.................'...../ ");
        logger().info("..........''...\\.......... _.·´ ");
        logger().info("............\\..............( ");
        logger().info("..............\\.............\\...");

    }

    @Override
    public void disable() {

    }
}
