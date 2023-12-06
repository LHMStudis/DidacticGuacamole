package com.github.LHMStudis.DidacticGuacamole;

import java.util.Scanner;

/**
 * Handles all console in and outputs
 *
 * @author <a href="https://github.com/LHMStudis">LHMStudis</a>
 */

public class ConsoleHandler {
	Scanner scanner = new Scanner(System.in);

	public ConsoleHandler() {
		this.output(OutputText.heading);
	}

	public String input() {
		return this.scanner.nextLine();
	}

	public void output(String text) {
		System.out.println(text);
	}

	public String inputCode() {
		this.output(OutputText.inputRequest);
		String codeInput = this.input().trim();
		this.output(OutputText.inputSuccess);
		if (codeInput.isEmpty()) {
			this.output(OutputText.inputEmpty);
			this.inputCode();
		}
		return codeInput;
	}
}
