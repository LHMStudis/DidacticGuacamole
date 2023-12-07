package main.java.com.github.LHMStudis.DidacticGuacamole;

import java.util.Scanner;

/**
 * Handles all console in and outputs
 *
 * @author <a href="https://github.com/LHMStudis">LHMStudis</a>
 */

public class ConsoleHandler {
	Scanner scanner = new Scanner(System.in);

	public ConsoleHandler() {
		this.printToConsole(OutputText.heading);
	}

	public String input() {
		return this.scanner.nextLine();
	}

	public void printToConsole(String text) {
		System.out.println(text);
	}

	public String inputCode() {
		this.printToConsole(OutputText.inputRequest);
		String codeInput = this.input().trim();
		this.printToConsole(OutputText.inputSuccess);
		if (codeInput.isEmpty()) {
			this.printToConsole(OutputText.inputEmpty);
			this.inputCode();
		}
		return codeInput;
	}
}
