package com.pruebasodexo.responce;

import com.pruebasodexo.models.Noticias;

public class NoticiasResponse {

	private Iterable<Noticias> noticias;
	
	public Iterable<Noticias> getNoticias() {
		return noticias;
	}
	public void setNoticias(Iterable<Noticias> noticias) {
		this.noticias = noticias;
	}

}
