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
	List<Region> getRegionesPorMacroRegion(MacroRegion macroRegion);
	List<Provincia> getProvinciasPorRegion(Region region);
	Capital getCapitalProvincia(Provincia provincia);
	List<Municipio> getMunicipiosProvincia(Provincia provincia);
	List<DistritoMunicipal> getDistritosMunicipalesMunicipio(Municipio municipio);
	List<Seccion> getSeccionesDistritoMunicipal(DistritoMunicipal distritoMunicipal);
	List<BarrioParajeSector> getBarrioParajeSectorPorSeccion (Seccion seccion);
	List<SubBarrioParajeSector> getSubBarriosParajesSectoresPorBarrioParajeSector (BarrioParajeSector barrioParajeSector);
	
	<T> void Adicionar();
	<T> boolean Actualizar();
	boolean Borrar(int domicilioId);
}
