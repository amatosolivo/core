package contratos;

import java.util.List;

import entidades.BarrioParajeSector;
import entidades.Capital;
import entidades.DistritoMunicipal;
import entidades.MacroRegion;
import entidades.Municipio;
import entidades.Provincia;
import entidades.Region;
import entidades.Seccion;
import entidades.SubBarrioParajeSector;

public interface DomiciliosDo {
	int DomicilioId = 0;
	MacroRegion macroRegion = null;
	Region region = null;
	Provincia provincia = null;
	Capital capital = null;
	Municipio municipio = null;
	DistritoMunicipal distritoMunicipal = null;
	Seccion seccion = null;
	BarrioParajeSector barrioParajeSector = null;
	SubBarrioParajeSector subBarrioParajeSector = null;
	
	Region getRegionesPorMacroRegion(MacroRegion macroRegion);
	List<Provincia> getProvinciasPorRegion(Region region);
	Capital getCapitalProvincia(Provincia provincia);
	List<Municipio> getMunicipiosProvincia(Provincia provincia);
	List<DistritoMunicipal> getDistritosMunicipalesMunicipio(Municipio municipio);
	List<Seccion> getSeccionesDistritoMunicipal(DistritoMunicipal distritoMunicipal);
	List<BarrioParajeSector> getBarrioParajeSectorPorSeccion (Seccion seccion);
	List<SubBarrioParajeSector> getSubBarriosParajesSectoresPorBarrioParajeSector (BarrioParajeSector barrioParajeSector);
	
	<T extends MacroRegion> void Adicionar(T macroRegion);
	<T extends MacroRegion> boolean Actualizar(T macroRegion);
	boolean Borrar(int domicilioId);
}
