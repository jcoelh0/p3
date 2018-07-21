package aula12.Ex2.plugins;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import aula12.Ex2.IPlugin;

public class Date implements IPlugin {

	@Override
	public void fazQualQuerCoisa() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

	}

}
