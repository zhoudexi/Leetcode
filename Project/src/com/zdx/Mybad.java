package com.zdx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Mybad {

	public static void main(String[] args) throws IOException {  
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer("");
		int kk = 0;
		while (true) {
			tokenizer = new StringTokenizer(reader.readLine());
			int in = Integer.parseInt(tokenizer.nextToken());
			int door = Integer.parseInt(tokenizer.nextToken());
			int out = Integer.parseInt(tokenizer.nextToken());
			if (in == 0 && door == 0 && out == 0)
				break;
			kk++;
			System.out.printf("Case %d: ", kk);
			Door d[] = new Door[20];
			for (int i = 1; i <= door; i++) {
				tokenizer = new StringTokenizer(reader.readLine());
				String kind = tokenizer.nextToken();
				int incont = 2;
				if (kind.equals("n"))
					incont = 1;
				int kinda = -1;
				if (kind.equals("a"))
					kinda = 1;
				else if (kind.equals("o"))
					kinda = 2;
				else if (kind.equals("x"))
					kinda = 3;
				else if (kind.equals("n"))
					kinda = 4;
				String aa = tokenizer.nextToken();
				int ina = Integer.parseInt(aa.substring(1));
				// System.out.println("ina :" + ina);
				if (aa.charAt(0) == 'i')
					ina = -ina;
				int inb = 0;
				if (incont == 2) {
					String bb = tokenizer.nextToken();
					inb = Integer.parseInt(bb.substring(1));
					// System.out.println("inb :" + inb);
					if (bb.charAt(0) == 'i')
						inb = -inb;
				}
				d[i] = new Door(i, kinda, ina, inb);
			}
			boolean[] visit = new boolean[60];
			for (int i = 0; i <= 3 * door; i++)
				visit[i] = true;
			int[] s = new int[20];
			int[] o = new int[20];
			int conts = 0;
			for (int i = 1; i <= door; i++) {
				int inta = d[i].ina;
				int intb = d[i].inb;
				if (inta > 0)
					d[inta].addout(i);
				if (intb > 0)
					d[intb].addout(i);
				if (inta <= 0 && intb <= 0)
					s[conts++] = i;
			}
			tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < out; i++)
				o[i] = Integer.parseInt(tokenizer.nextToken());
			int test = Integer.parseInt(reader.readLine());
			int[] ins = new int[10];
			String outs = "";
			String res = "";
			for (int i = 0; i < test; i++) {
				tokenizer = new StringTokenizer(reader.readLine());
				for (int j = 1; j <= in; j++)
					ins[j] = Integer.parseInt(tokenizer.nextToken());
				outs = "";
				for (int j = 0; j < out; j++)
					outs += tokenizer.nextToken();
				for (int cas = 0; cas <= 3 * door; cas++) {
					if (visit[cas]) {
						for (int j = 1; j <= door; j++)
							d[j].cont = d[j].have = 0;
						for (int j = 0; j < conts; j++) {
							int id = s[j];
							d[id].cal(ins, d, cas);
						}
						res = "";
						for (int j = 0; j < out; j++)
							res += String.valueOf(d[o[j]].value);
						if (outs.equals(res) == false)
							visit[cas] = false;
					}
				}
			}
			if(visit[0] == true)
				System.out.println("No faults detected");
			else {
				int one = -1;
				boolean mark = true;
				for(int i = 0; i<=3*door; i++) {
					if(visit[i] == true)
					{
						if(one == -1)
							one = i;
						else
						{
							mark = false;
							break;
						}
					}
				}
				if(mark) {
					int id = (one-1)/3 + 1;
					int r = one%3;
					if(r == 0)
						r+=3;
					if(r == 1)
						System.out.printf("Gate %d is failing; output inverted\n", id);
					else if(r == 2)
						System.out.printf("Gate %d is failing; output stuck at 0\n", id);
					else if(r == 3)
						System.out.printf("Gate %d is failing; output stuck at 1\n", id);
				}
				else
					System.out.println("Unable to totally classify the failure");
			}
		}
	}
}

class Door {
	int id;
	int incont;
	int cont;
	int ina, inb;
	int kind;
	int outcont;
	int va, vb, value;
	int[] out = new int[20];
	int have;

	public Door(int id_, int kind_, int ina_, int inb_) {
		id = id_;
		kind = kind_;
		ina = ina_;
		inb = inb_;
		incont = 0;
		if (ina > 0)
			incont++;
		if (inb > 0)
			incont++;
		outcont = cont = have = 0;
	}

	public void addout(int num) {
		out[outcont++] = num;
	}

	public void cal(int[] ins, Door[] d, int cas) {
		if (ina < 0)
			va = ins[-ina];
		else if (ina > 0)
			va = d[ina].value;
		if (inb < 0)
			vb = ins[-inb];
		else if (inb > 0)
			vb = d[inb].value;
		if (kind == 1)
			value = va & vb;
		else if (kind == 2)
			value = va | vb;
		else if (kind == 3)
			value = va ^ vb;
		else if (kind == 4)
			value = va == 0 ? 1 : 0;
		if (cas != 0 && (cas - 1) / 3 + 1 == id) {
			int r = cas % 3;
			if (r == 0)
				r = 3;
			if (r == 1)
				value = value == 0 ? 1 : 0;
			else if (r == 2)
				value = 0;
			else if (r == 3)
				value = 1;
		}
		update(ins, d, cas);
	}

	public void update(int[] ins, Door[] d, int r) {
		for (int i = 0; i < outcont; i++) {
			d[out[i]].cont++;
			if (d[out[i]].cont == d[out[i]].incont) {
				d[out[i]].cal(ins, d, r);
			}
		}
	}
}