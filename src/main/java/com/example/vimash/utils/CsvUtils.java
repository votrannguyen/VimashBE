package com.example.vimash.utils;

import java.util.ResourceBundle;

public class CsvUtils {
	 protected final char separator;
	    protected final char quotechar;
	    protected final char escapechar;
	    private static ResourceBundle rsItemCsvJp;
	    private static ResourceBundle rsItemCsvEn;
		/**
		 * @param separator
		 * @param quotechar
		 * @param escapechar
		 */
		public CsvUtils(char separator, char quotechar, char escapechar) {
			super();
			this.separator = separator;
			this.quotechar = quotechar;
			this.escapechar = escapechar;
		}
	  
}
