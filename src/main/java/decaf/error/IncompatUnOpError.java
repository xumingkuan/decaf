package decaf.error;

import decaf.tree.Pos;

/**
 * example：incompatible operand: - int[]<br>
 * PA2
 */
public class IncompatUnOpError extends DecafError {

	private String op;

	private String expr;

	public IncompatUnOpError(Pos pos, String op, String expr) {
		super(pos);
		this.op = op;
		this.expr = expr;
	}

	@Override
	protected String getErrMsg() {
		return "incompatible operand: " + op + " " + expr;
	}

}
