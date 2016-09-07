// Copyright (c) 2016 Akop Karapetyan
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.

package org.akop.solver;

import java.util.*;


class Word
{
	static final int DIR_ACROSS = 0;
	static final int DIR_DOWN   = 1;

	final int number;
	final int row;
	final int col;
	final int dir;
	final int len;

	Word(int dir, int number, int row, int col, int len)
	{
		if (dir != DIR_ACROSS && dir != DIR_DOWN) {
			throw new IllegalArgumentException("Direction not valid");
		}

		this.dir = dir;
		this.number = number;
		this.row = row;
		this.col = col;
		this.len = len;
	}

	@Override
	public String toString()
	{
		return String.format("%2d%s. (%d,%d) (%d)\n", number,
			dir == DIR_ACROSS ? "A" : "D", row, col, len);
	}
}
