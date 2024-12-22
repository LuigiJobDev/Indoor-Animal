# Indoor-Animal
--
Class Main (classe principale):
1.Creare le istanze degli animali (Dog, Cat, Fish) estendendo la classe astratta Animal
1.1.Chiamare i metodi:
.verso() per mostrare il verso dell'animale
.azione() per rappresentare un comportamento tipico
.luogo() per indicare il lugo preferito
--
Class Animal (classe astratta):
2.Definisce un attributo comune a tutti gli animali (nome)
2.1.Metodi astratti:
.verso() definisce il verso che ogni animale farà
.azione() rappresenta un azione specifica
.luogo() specifica l'habitat o il luogo preferito dell'animale
2.1.2.Metodo concreto:
.getNome(): restituisce il nome dell'animale
--
Class Dog/Class Cat/Class Fish (classi derivate)
3.Queste classi estendono la classe Animal e implementano i metodi astratti, specificando:
.Verso: Il suono unico prodotto dall'animale es:(Bau, Bau!) per il cane
.Azione: Un comportamento tipico es:(Scodinzola...)
.Luogo: L'habitat preferito es:(La cuccia)
--
4.Principi di Programmazione
1.Classi Astratte:
# Le sottoclassi (Dog, Cat, Fish) devono implementare tutti i metodi astartti definiti nella classe Animal
# I metodi astratti non hanno un corpo nella classe base, ma obbligano le sottoclassi a fornire un'implemaentazione
  personalizzata
2.Modularità e Riutilizzabilità
# La classe Animal fornisce una struttura comune, semplificando l'aggiunta di nuovi tipi di animali
