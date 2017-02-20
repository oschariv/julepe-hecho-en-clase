
/**
 * Write a description of class Baza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baza
{
    private Carta[] cartasDeLaBaza;
    private int cartasEnLaBaza;
    private Carta cartaQueVaGanando;
    private String nombreJugadorQueVaGanando;
    private Palo paloQuePinta;

    /**
     * Constructor for objects of class Baza
     */
    public Baza(int numeroJugadores, Palo paloQuePinta)
    {
        cartasEnLaBaza = 0;
        cartasDeLaBaza = new Carta[numeroJugadores];
        cartaQueVaGanando = null;
        nombreJugadorQueVaGanando = null;
        this.paloQuePinta = paloQuePinta;
    }
    
    public void addCarta(Carta cartaTirada, String nombreJugador)
    {        
        cartasDeLaBaza[cartasEnLaBaza] = cartaTirada;
        cartasEnLaBaza++;
        if (cartasEnLaBaza == 1) {
            cartaQueVaGanando = cartaTirada;
            nombreJugadorQueVaGanando = nombreJugador;
        }
        else {
            if (cartaTirada.ganaA(cartaQueVaGanando, paloQuePinta)) {
                cartaQueVaGanando = cartaTirada;
                nombreJugadorQueVaGanando = nombreJugador;
            }
        }

    }
    
    public Palo getPaloPrimeraCartaDeLaBaza()
    {
        Palo paloPrimeraCarta = null;
        
        if (cartasEnLaBaza != 0) {
            paloPrimeraCarta = cartasDeLaBaza[0].getPalo();
        }
        
        return paloPrimeraCarta;
    }
    
    public Carta cartaQueVaGanandoLaBaza() 
    {
        return cartaQueVaGanando;
    }
    
    public String nombreJugadorQueVaGanandoLaBaza()
    {
        return nombreJugadorQueVaGanando;
    }
    
    

}















