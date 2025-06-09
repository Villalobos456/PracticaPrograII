class Obra {
    public String titulo;
    public String material;
    public Artista a1, a2;
    public Anuncio anuncio;
    public Obra(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio) {
        this.titulo = titulo;
        this.material = material;
        this.a1 = a1;
        this.a2 = a2;
        this.anuncio = anuncio;
    }
}