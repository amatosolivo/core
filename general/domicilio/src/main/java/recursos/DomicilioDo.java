package recursos;

import java.util.ArrayList;
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
import repositorio.DomiciliosDoRepoMoc;

public class DomicilioDo  {
	private DomiciliosDoRepoMoc repositorio = new DomiciliosDoRepoMoc();
	
	public void AddDomicilio() {
		MacroRegion mr = new MacroRegion();
		Region rg = new Region();
		Provincia pv = new Provincia();
		Capital cp = new Capital();
		Municipio mu = new Municipio();
		DistritoMunicipal dm = new DistritoMunicipal();
		Seccion se = new Seccion();
		BarrioParajeSector bps = new BarrioParajeSector();
		SubBarrioParajeSector sbps = new SubBarrioParajeSector();
				
		List<SubBarrioParajeSector> subBarriosParajesSectores = new ArrayList<SubBarrioParajeSector>();
		List<BarrioParajeSector> barriosParajesSectores = new ArrayList<BarrioParajeSector>();
		List<Seccion> secciones = new ArrayList<Seccion>();
		List<DistritoMunicipal> distritosMunicipales = new ArrayList<DistritoMunicipal>();
		List<Municipio> municipios = new ArrayList<Municipio>();		
		List<Provincia> provincias = new ArrayList<Provincia>();
		List<Region> regiones = new ArrayList<Region>();		
		
		bps.setSubBarriosParajesSectores(subBarriosParajesSectores);		
		se.setBarriosParajesSectores(barriosParajesSectores);		
		dm.setSecciones(secciones);		
		mu.setDistritosMunicipales(distritosMunicipales);		
		pv.setCapital(cp);
		pv.setMunicipios(municipios);
		rg.setProvincias(provincias);		
		mr.setRegiones(regiones);
		
		repositorio.Adicionar(mr);
	}
	
}
