package Fisca;

import java.sql.Date;

public class modelo {

	private String Dominio;
	private Date fecha;
	private Boolean Ushuaia; 
	private Boolean Tolhuin; 
	private Boolean CentrosInvernales; 
	private Boolean RioGrande;
	private Boolean Puesto365;
	private Boolean ParqueNacional;
	private Boolean LagoEscondido;
	private Boolean PuestoCesarReal;
	private Boolean Particular;
	private Boolean CargasGenerales;
	private Boolean CargasPeligrosas; 
	private Boolean Alquilado;
	private Boolean Taxi;
	private Boolean Remis;
	private Boolean Turismo;
	private Boolean TurismoAlternativo;
	private Boolean Oficial;
	private Boolean Auto; 
	private Boolean Pickup;
	private Boolean Maquinaria;
	private Boolean Omnibus;
	private Boolean Rural; 
	private Boolean Moto;
	private Boolean Semi; 
	private Boolean CamionTractor;
	private Boolean Sprinter;
	private Boolean TodoTerreno; 
	private Boolean Minibus; 
	private Boolean Furgon;
	private Boolean A;
	private Boolean B;
	private Boolean C;
	private Boolean D;
	private Boolean E;
	private Boolean G; 
	private Boolean Infraccionado; 
	private Boolean NoInfraccionado;
	private Boolean RTO;
	private Boolean SEGURO;
	private Boolean CINTURON; 
	private Boolean LUCES;
	private Boolean HABILITACION;
	
	public modelo (String Dominio, Date fecha,Boolean Ushuaia, Boolean Tolhuin,Boolean CentrosInvernales, Boolean RioGrande,  Boolean Puesto365, Boolean ParqueNacional,Boolean LagoEscondido, Boolean PuestoCesarReal,  Boolean Particular, Boolean CargasGenerales, Boolean CargasPeligrosas,Boolean Alquilado, Boolean Taxi, Boolean Remis, Boolean Turismo, Boolean TurismoAlternativo, Boolean Oficial, Boolean Auto, Boolean Pickup, Boolean Maquinaria, Boolean Omnibus, Boolean Rural, Boolean Moto, Boolean Semi, Boolean CamionTractor, Boolean Sprinter, Boolean TodoTerreno, Boolean Minibus, Boolean Furgon, Boolean A, Boolean B, Boolean C, Boolean D, Boolean E, Boolean G, Boolean Infraccionado, Boolean NoInfraccionado, Boolean RTO, Boolean SEGURO, Boolean CINTURON,  Boolean LUCES, Boolean HABILITACION) {
		
		this.Dominio = Dominio;
		this.fecha = fecha;
		this.Ushuaia = Ushuaia;
		this.Tolhuin = Tolhuin;
		this.CentrosInvernales = CentrosInvernales;
		this.RioGrande = RioGrande;
		this.Puesto365 = Puesto365;
		this.ParqueNacional = ParqueNacional;
		this.LagoEscondido = LagoEscondido;
		this.PuestoCesarReal = PuestoCesarReal;
		this.Particular = Particular;
		this.CargasGenerales = CargasGenerales;
		this.CargasPeligrosas = CargasPeligrosas;
		this.Alquilado = Alquilado;
		this.Taxi = Taxi;
		this.Remis = Remis;
		this.Turismo = Turismo;
		this.TurismoAlternativo = TurismoAlternativo;
		this.Oficial = Oficial;
		this.Auto = Auto;
		this.Pickup = Pickup;
		this.Maquinaria = Maquinaria;
		this.Omnibus = Omnibus;
		this.Rural = Rural;
		this.Moto = Moto;
		this.Semi =Semi;
		this.CamionTractor = CamionTractor;		
		this.Sprinter = Sprinter;
		this.TodoTerreno = TodoTerreno;
		this.Minibus =Minibus; 
		this.Furgon =Furgon;
		this.A =A;
		this.B =B;
		this.C =C;
		this.D =D;
		this.E =E;
		this.G =G; 
		this.Infraccionado =Infraccionado; 
		this.NoInfraccionado =NoInfraccionado;
		this.RTO =RTO;
		this.SEGURO =SEGURO;
		this.CINTURON =CINTURON; 
		this.LUCES =LUCES;
		this.HABILITACION = HABILITACION;
		
	}

	public String getDominio() {
		return Dominio;
	}

	public void setDominio(String dominio) {
		Dominio = dominio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Boolean getUshuaia() {
		return Ushuaia;
	}

	public void setUshuaia(Boolean ushuaia) {
		Ushuaia = ushuaia;
	}

	public Boolean getTolhuin() {
		return Tolhuin;
	}

	public void setTolhuin(Boolean tolhuin) {
		Tolhuin = tolhuin;
	}

	public Boolean getCentrosInvernales() {
		return CentrosInvernales;
	}

	public void setCentrosInvernales(Boolean centrosInvernales) {
		CentrosInvernales = centrosInvernales;
	}

	public Boolean getRioGrande() {
		return RioGrande;
	}

	public void setRioGrande(Boolean rioGrande) {
		RioGrande = rioGrande;
	}

	public Boolean getPuesto365() {
		return Puesto365;
	}

	public void setPuesto365(Boolean puesto365) {
		Puesto365 = puesto365;
	}

	public Boolean getParqueNacional() {
		return ParqueNacional;
	}

	public void setParqueNacional(Boolean parqueNacional) {
		ParqueNacional = parqueNacional;
	}

	public Boolean getLagoEscondido() {
		return LagoEscondido;
	}

	public void setLagoEscondido(Boolean lagoEscondido) {
		LagoEscondido = lagoEscondido;
	}

	public Boolean getPuestoCesarReal() {
		return PuestoCesarReal;
	}

	public void setPuestoCesarReal(Boolean puestoCesarReal) {
		PuestoCesarReal = puestoCesarReal;
	}

	public Boolean getParticular() {
		return Particular;
	}

	public void setParticular(Boolean particular) {
		Particular = particular;
	}

	public Boolean getCargasGenerales() {
		return CargasGenerales;
	}

	public void setCargasGenerales(Boolean cargasGenerales) {
		CargasGenerales = cargasGenerales;
	}

	public Boolean getCargasPeligrosas() {
		return CargasPeligrosas;
	}

	public void setCargasPeligrosas(Boolean cargasPeligrosas) {
		CargasPeligrosas = cargasPeligrosas;
	}

	public Boolean getAlquilado() {
		return Alquilado;
	}

	public void setAlquilado(Boolean alquilado) {
		Alquilado = alquilado;
	}

	public Boolean getTaxi() {
		return Taxi;
	}

	public void setTaxi(Boolean taxi) {
		Taxi = taxi;
	}

	public Boolean getRemis() {
		return Remis;
	}

	public void setRemis(Boolean remis) {
		Remis = remis;
	}

	public Boolean getTurismo() {
		return Turismo;
	}

	public void setTurismo(Boolean turismo) {
		Turismo = turismo;
	}

	public Boolean getTutismoAlternativo() {
		return TurismoAlternativo;
	}

	public void setTutismoAlternativo(Boolean tutismoAlternativo) {
		TurismoAlternativo = tutismoAlternativo;
	}

	public Boolean getOficial() {
		return Oficial;
	}

	public void setOficial(Boolean oficial) {
		Oficial = oficial;
	}

	public Boolean getAuto() {
		return Auto;
	}

	public void setAuto(Boolean auto) {
		Auto = auto;
	}

	public Boolean getPickup() {
		return Pickup;
	}

	public void setPickup(Boolean pickup) {
		Pickup = pickup;
	}

	public Boolean getMaquinaria() {
		return Maquinaria;
	}

	public void setMaquinaria(Boolean maquinaria) {
		Maquinaria = maquinaria;
	}

	public Boolean getOmnibus() {
		return Omnibus;
	}

	public void setOmnibus(Boolean omnibus) {
		Omnibus = omnibus;
	}

	public Boolean getRural() {
		return Rural;
	}

	public void setRural(Boolean rural) {
		Rural = rural;
	}

	public Boolean getMoto() {
		return Moto;
	}

	public void setMoto(Boolean moto) {
		Moto = moto;
	}

	public Boolean getSemi() {
		return Semi;
	}

	public void setSemi(Boolean semi) {
		Semi = semi;
	}

	public Boolean getCamionTractor() {
		return CamionTractor;
	}

	public void setCamionTractor(Boolean camionTractor) {
		CamionTractor = camionTractor;
	}

	public Boolean getSprinter() {
		return Sprinter;
	}

	public void setSprinter(Boolean sprinter) {
		Sprinter = sprinter;
	}

	public Boolean getTodoTerreno() {
		return TodoTerreno;
	}

	public void setTodoTerreno(Boolean todoTerreno) {
		TodoTerreno = todoTerreno;
	}

	public Boolean getMinibus() {
		return Minibus;
	}

	public void setMinibus(Boolean minibus) {
		Minibus = minibus;
	}

	public Boolean getFurgon() {
		return Furgon;
	}

	public void setFurgon(Boolean furgon) {
		Furgon = furgon;
	}

	public Boolean getA() {
		return A;
	}

	public void setA(Boolean a) {
		A = a;
	}

	public Boolean getB() {
		return B;
	}

	public void setB(Boolean b) {
		B = b;
	}

	public Boolean getC() {
		return C;
	}

	public void setC(Boolean c) {
		C = c;
	}

	public Boolean getD() {
		return D;
	}

	public void setD(Boolean d) {
		D = d;
	}

	public Boolean getE() {
		return E;
	}

	public void setE(Boolean e) {
		E = e;
	}

	public Boolean getG() {
		return G;
	}

	public void setG(Boolean g) {
		G = g;
	}

	public Boolean getInfraccionado() {
		return Infraccionado;
	}

	public void setInfraccionado(Boolean infraccionado) {
		Infraccionado = infraccionado;
	}

	public Boolean getNoInfraccionado() {
		return NoInfraccionado;
	}

	public void setNoInfraccionado(Boolean noInfraccionado) {
		NoInfraccionado = noInfraccionado;
	}

	public Boolean getRTO() {
		return RTO;
	}

	public void setRTO(Boolean rTO) {
		RTO = rTO;
	}

	public Boolean getSEGURO() {
		return SEGURO;
	}

	public void setSEGURO(Boolean sEGURO) {
		SEGURO = sEGURO;
	}

	public Boolean getCINTURON() {
		return CINTURON;
	}

	public void setCINTURON(Boolean cINTURON) {
		CINTURON = cINTURON;
	}

	public Boolean getLUCES() {
		return LUCES;
	}

	public void setLUCES(Boolean lUCES) {
		LUCES = lUCES;
	}

	public Boolean getHABILITACION() {
		return HABILITACION;
	}

	public void setHABILITACION(Boolean hABILITACION) {
		HABILITACION = hABILITACION;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
