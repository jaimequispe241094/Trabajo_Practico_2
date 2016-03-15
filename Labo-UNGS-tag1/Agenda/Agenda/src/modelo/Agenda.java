package modelo;

import java.util.List;
import persistencia.dao.LocalidadDAO;
import persistencia.dao.PersonaDAO;
import persistencia.dao.TipoContactoDAO;
import dto.LocalidadDTO;
import dto.PersonaDTO;
import dto.TipoContactoDTO;

public class Agenda 
{
	private PersonaDAO persona;	
	private LocalidadDAO localidad;
	private TipoContactoDAO tipoContacto;
	
	public Agenda()
	{
		persona = new PersonaDAO();
		localidad = new LocalidadDAO();
		tipoContacto = new TipoContactoDAO();
	}
	
	public void agregarPersona(PersonaDTO nuevaPersona)
	{
		persona.insert(nuevaPersona);
	}

	public void agregarLocalidad(LocalidadDTO nuevaLocalidad)
	{
		localidad.insert(nuevaLocalidad);
	}
	
	public void agregarTipoContacto(TipoContactoDTO nuevoTipo)
	{
		tipoContacto.insert(nuevoTipo);
	}
	
	public void borrarPersona(PersonaDTO persona_a_eliminar) 
	{
		persona.delete(persona_a_eliminar);
	}
	
	public void borrarLocalidad(LocalidadDTO localidad_a_eliminar)
	{
		localidad.delete(localidad_a_eliminar);
	}
	
	public void borrarTipoContacto(TipoContactoDTO tipo_a_eliminar)
	{
		tipoContacto.delete(tipo_a_eliminar);
	}
	
	public List<PersonaDTO> obtenerPersonas()
	{
		return persona.readAll();		
	}
	
	public List<LocalidadDTO> obtenerLocalidades()
	{
		return localidad.readAll();
	}
	
	public List<TipoContactoDTO> obtenerTipoContactos()
	{
		return tipoContacto.readAll();
	}
}
