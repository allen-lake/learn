package com.allenlake.c01.stub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ningbo.zhao
 * @since 2018年04月01日
 */
public class PureServiceImpl implements PureService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PureServiceImpl.class);

    @Override
    public String echo(String text) {
        LOGGER.info("text: {}", text);
        return text;
    }

    @Override
    public String echoRandom(String text) {
        LOGGER.info("text: {}", text);
        return text + text.hashCode();
    }

    @Override
    public String random(String text) {
        LOGGER.info("text: {}", text);
        return "" + text.hashCode();
    }
}
