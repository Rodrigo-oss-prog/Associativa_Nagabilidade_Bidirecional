# Classe Associativa
## Navegabilidade bidirecional (ambas as classes se enxergam)
## Multiplicidade 1 para muitos 
`````
public void ClasseA{
      private List<ClasseB> classeb = new ArrayList<>(); 
}
`````
`````
public void ClasseB{
      private ClasseA classea;
`````
