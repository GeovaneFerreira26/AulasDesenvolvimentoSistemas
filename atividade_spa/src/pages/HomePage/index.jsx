import './style.css'; // Certifique-se de que o CSS está na mesma pasta

export default function HomePage() {
    return (
        <main className="container-colunas">
            <div className="fundacao">
                <h2>Fundação</h2>
                <p>O clube foi fundado em 13 de maio de 1899 pelos irmãos Artur e Artêmio Valente, juntamente com outros dezessete jovens. Eles eram de uma antiga família baiana e descobriram o futebol durante seus estudos no Reino Unido . Inicialmente, o Vitória era um clube de críquete, chamado Club de Cricket Victoria , porque todos eles moravam no bairro Vitória , em Salvador.
                Em 22 de maio de 1901, o Vitória disputou sua primeira partida de futebol no Campo da Pólvora, contra o International Sport Club, um time cujos jogadores eram marinheiros ingleses. O Vitória venceu o International por 3 a 2. Dois meses depois dessa partida, o Vitória mudou suas cores originais, que eram preto e branco, para vermelho e preto, que ainda são usadas.
                Campeões Baianos de 1908 – Milzen, Álvaro Tarquinio e Mario Pereira; AC Martins, Adriano Porto e Noé Nunes; Armando Gordilho, Oscar Alves, Fernando Alves, C. Muller, R. Mc. Nair, Oscar Luz, A. Galeão e Alfredo Seixas.
                Em 13 de setembro de 1903, o Vitória venceu o São Paulo Bahia Football Club por 2 a 0, em sua primeira partida oficial. Em 1908, o Vitória conquistou seu primeiro título, o Campeonato Baiano , e repetiu o feito no ano seguinte.
                De 1910 a 1952, o clube não conquistou nenhum título por ainda ser amador. Em 1953, profissionalizou-se e venceu seu terceiro campeonato baiano. O Bahia dominava o campeonato estadual, e o Vitória só conquistou títulos em 1955, 1957, 1964, 1965, 1972, 1980, 1985 e 1989.
                </p>
            </div>
            
            <div className="jogos-a-fazer">
                <h2>Jogos a Realizar</h2>
                <p>FORTALEZA X VITÓRIA</p>
                <p>VITÓRIA X FORTALEZA</p>
                <p>VITÓRIA x REMO</p>
                
            </div>
            
            <div className="jogos-realizados">
                <h2>Jogos Realizados</h2>
                <p>Conteúdo da terceira coluna. Útil para barras laterais, links ou avisos.</p>
            </div>
        </main>
    );
}