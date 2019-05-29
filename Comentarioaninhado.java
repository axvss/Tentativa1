import java.io.IOException;
import java.io.PushbackReader;

import sable.lexer.IPushbackReader;
import sable.lexer.Lexer;
import sable.lexer.LexerException;

public class Comentarioaninhado extends Lexer{
	

	public Comentarioaninhado(PushbackReader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	protected void filter() throws LexerException, IOException
	{
		if(token.getClass().getSimpleName().toString().equals("TAbrec")|token.getClass().getSimpleName().toString().equals("TFechac")) {
			int pos = token.getPos();
			int linha = token.getLine();
			System.out.print("Erro de comentario na posicao: " + linha +","+ pos);
    }
	}
}
