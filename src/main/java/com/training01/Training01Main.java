package com.training01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Training01:Spring Core (DI), Maven, Log4J 2
 *
 * @author jun-ichi
 *
 */
public class Training01Main {

	/* logger */
	private final static Logger log = LogManager.getLogger(Training01Main.class);

	/*
	 * Entry point
	 */
	public static void main(String[] args) {

		/* log4j test */
		log.trace("trace-トレース");
		log.debug("debug-デバッグ");
		log.info("info-インフォメーション");
		log.error("error-エラー");
		log.fatal("fatal-ファタル");
	}
}
