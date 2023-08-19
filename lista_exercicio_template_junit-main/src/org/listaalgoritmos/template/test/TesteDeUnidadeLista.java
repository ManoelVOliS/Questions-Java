package org.listaalgoritmos.template.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;
import org.listaalgoritmos.template.RespostaListaExercicio;

public class TesteDeUnidadeLista {

	/*
	 * ATENÇÃO. A IMPLEMENTAÇÃO REALIZADA NESTA CLASSE NÃO DEVE SER MODIFICADA.
	 * CASO OCORRA MODIFICAÇÃO, OS TESTES PODEM SE COMPORTAR DE FORMA INCORRETA.
	 */

	@Test
	public void testQuestaoUmListaUm() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void testQuestaoDoisListaUm() {
		Assert.assertEquals(26f,Math.round(RespostaListaExercicio.calcularImc(80f, 1.75f)), 0);
	}
	
	@Test
	public void testQuestaoTresListaUm() {
		Assert.assertEquals(75f, RespostaListaExercicio.calcularAreaTrapezio(20f, 10f, 5f), 0);
	}

	@Test
	public void testQuestaoQuatroListaUm() {
		Assert.assertEquals(5, RespostaListaExercicio.maiorEntreDoisInteiros(5, 2));
		Assert.assertEquals(5, RespostaListaExercicio.maiorEntreDoisInteiros(2, 5));
	}
	
	@Test
	public void testQuestaoCincoListaUm() {
		Assert.assertTrue(RespostaListaExercicio.verificarParImpar(10));
		Assert.assertFalse(RespostaListaExercicio.verificarParImpar(5));
	}
	
	@Test
	public void testQuestaoUmListaDois() {
		float[] notas = {10,9,8,7,6};
		Assert.assertEquals(8f,RespostaListaExercicio.calcularMediaNotas(notas), 0);
	}
	
	@Test
	public void testQuestaoDoisListaDois() {
		int[] arrayOrig = {6,5,4,3,2,1};
		String resultado = "1,2,3,4,5,6";
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		RespostaListaExercicio.imprimirArrayInverso(arrayOrig);
		System.setOut(old);
		Assert.assertTrue(resultado.equals(baos.toString()));
		
	}
	
	@Test
	public void testQuestaoTresListaDois() {
		Assert.assertTrue(false);
	}

	@Test
	public void testQuestaoQuatroListaDois() {
		int[] arrayOrig = {1,2,3,4,5,6,7,8,9,10,11};
		String resultado = "2 3 5 7 11 ";
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		RespostaListaExercicio.imprimirElementosPrimos(arrayOrig);;
		System.setOut(old);
		Assert.assertTrue(resultado.equals(baos.toString()));
	}
	
	@Test
	public void testQuestaoCincoListaDois() {
		int[] arrayOrig = {1,2,3,4,5,6,7,8,9,10,11};
		String resultado = "1 3 5 7 9 11 ";
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		RespostaListaExercicio.imprimirElementosImpares(arrayOrig);;
		System.setOut(old);
		Assert.assertTrue(resultado.equals(baos.toString()));
	}
	
	@Test
	public void testQuestaoSeisListaDois() {
		int[] arrayOrig = {1,2,3,4,5,6,7,8,9,10,11};
		String resultado = "2 4 6 8 10 ";
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		RespostaListaExercicio.imprimirElementosPares(arrayOrig);;
		System.setOut(old);
		Assert.assertTrue(resultado.equals(baos.toString()));
	}
	
	@Test
	public void testQuestaoSeteListaDois() {
		int[] arrayOrig = {5,10,33,4,1,27,71,38,19,1,9,9};
		String resultado = "71 1 ";
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out;
		System.setOut(ps);
		RespostaListaExercicio.imprimirMaiorMenorElemento(arrayOrig);;
		System.setOut(old);
		Assert.assertTrue(resultado.equals(baos.toString()));
	}
	
	@Test
	public void testQuestaoOitoListaDois() {
		int[] arrayOrig = {15,33,4,1,27,71,38,19,1,9,9,13};
		Assert.assertEquals(20f, RespostaListaExercicio.calcularMediaAritmetica(arrayOrig), 0);
	}

}
