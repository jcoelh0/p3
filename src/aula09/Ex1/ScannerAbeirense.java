package aula09.Ex1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.*;

public class ScannerAbeirense implements Iterator<String>, Closeable {
	private final Scanner read;

	public ScannerAbeirense(Scanner read) {
		this.read = read;
	}

	@Override
	public void close() throws IOException {
		read.close();
	}

	@Override
	public boolean hasNext() {
		return read.hasNext();
	}

	@Override
	public String next() throws NoSuchElementException {
		String s = read.next();

		s = s.replace('v', 'b');
		s = s.replace('V', 'B');

		return s;
	}

	public String nextLine() throws NoSuchElementException {
		String s = read.nextLine();

		s = s.replace('v', 'b');
		s = s.replace('V', 'B');

		return s;
	}
}
