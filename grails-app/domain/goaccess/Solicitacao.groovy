package goaccess

class Solicitacao {

	String status
	String protocolo
	String tipo
	OperadorCTI operador
	AutorizadorProf autorizador
	UsuarioSolicitante usuario
	Date data
	
	
	String toString(){
		"${this.protocolo}"
	}
	
	static belongsTo = [OperadorCTI,AutorizadorProf,UsuarioSolicitante]
	
	static hasMany = [equipamentos:Equipamento]
	
	static constraints = {
		status(blank:false)
		protocolo(blank:false)
		tipo(blank:false)
		data(blank:false)
    }
}
