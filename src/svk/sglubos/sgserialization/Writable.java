/* The MIT License (MIT)
 *
 * Copyright (c) 2016 Ľubomír Hlavko
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package svk.sglubos.sgserialization;

import java.nio.charset.Charset;

public interface Writable {
	public int write(byte data, int index);
	public int write(short data, int index);
	public int write(int data, int index);
	public int write(long data, int index);
	public int write(float data, int index);
	public int write(double data, int index);
	public int write(char data, int index);
	public int write(boolean data, int index);
	
	public int write(byte[] data, int index);
	public int write(short[] data, int index);
	public int write(int[] data, int index);
	public int write(long[] data, int index);
	public int write(float[] data, int index);
	public int write(double[] data, int index);
	public int write(char[] data, int index);
	public int write(boolean[] data, int index);
	
	public int write(Serializable data, int index);
	public int write(Serializable[] data, int index);
	
	public int write(String data, int index);
	public int write(String data, Charset charset, int index);
}