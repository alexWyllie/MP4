package hudson.util;

import java.io.IOException;
import java.io.OutputStream;

public abstract class ForkOutputStreamSuperClass extends OutputStream {

	protected final OutputStream lhs;
	protected final OutputStream rhs;

	public ForkOutputStreamSuperClass(OutputStream lhs, OutputStream rhs) {
		this.lhs = lhs;
        this.rhs = rhs;
	}

	public void write(int b) throws IOException {
	    lhs.write(b);
	    rhs.write(b);
	}

	@Override
	public void write(byte[] b) throws IOException {
	    lhs.write(b);
	    rhs.write(b);
	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
	    lhs.write(b, off, len);
	    rhs.write(b, off, len);
	}

	@Override
	public void flush() throws IOException {
	    lhs.flush();
	    rhs.flush();
	}

	@Override
	public void close() throws IOException {
	    lhs.close();
	    rhs.close();
	}

}