/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Damas;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
final class GestorMovimiento {
    
	private Movimiento inicio;
	private int n;
	
	
	GestorMovimiento(GestorFichas gf, Fichas[] f){
		Movimiento[] m;
		n=0;
            for (Fichas f1 : f) {
                m = GestorMovimiento.movFicha(gf, f1);
                for (Movimiento m1 : m) {
                    agregarMovimiento(m1);
                }
            }
			
	}
    
	public void agregarMovimiento(Movimiento a){
		a.setNext(inicio);
		if(inicio != null){
			inicio.setPrev(a);
			
		}
		inicio = a;
		n++;
	}
	
	public static Movimiento[] movFicha(GestorFichas gf,Fichas f){
		ArrayList<Movimiento> m = new ArrayList<>();
		Movimiento[] mov;
		if(f.esRoja()){
	
		if(!gf.puedeComer(f)){
			if(gf.buscarFicha(f.getXp()+1,f.getYp()+1)==null&&f.getXp()!=8&&
				f.getYp()!=8)
				m.add(new Movimiento(f,f.getXp()+1,f.getYp()+1));
				
			if(gf.buscarFicha(f.getXp()-1,f.getYp()+1)==null&&f.getXp()>1&&f.getYp()<8)
				m.add(new Movimiento(f,f.getXp()-1,f.getYp()+1));
				
			if(gf.buscarFicha(f.getXp()+1,f.getYp()-1)==null&&f.getCorona()&&f.getXp()<8&&f.getYp()>1)
				m.add(new Movimiento(f,f.getXp()+1,f.getYp()-1));
				
			if(gf.buscarFicha(f.getXp()-1,f.getYp()-1)==null&&f.getCorona()&&f.getXp()>1&&f.getYp()>1)
				m.add(new Movimiento(f,f.getXp()-1,f.getYp()-1));
				
		}else
		{
			if(gf.buscarFicha(f.getXp()+1,f.getYp()+1)!=null&&
				gf.buscarFicha(f.getXp()+1,f.getYp()+1).esRoja()!=f.esRoja()&&
					gf.buscarFicha(f.getXp()+2,f.getYp()+2)==null&&f.getXp()<7&&f.getYp()<7)
						m.add(new Movimiento(f,f.getXp()+2,f.getYp()+2));
				
			if(gf.buscarFicha(f.getXp()-1,f.getYp()+1)!=null&&
				gf.buscarFicha(f.getXp()-1,f.getYp()+1).esRoja()!=f.esRoja()&&
					gf.buscarFicha(f.getXp()-2,f.getYp()+2)==null&&f.getXp()>2&&f.getYp()<7)
						m.add(new Movimiento(f,f.getXp()-2,f.getYp()+2));
						
			if(gf.buscarFicha(f.getXp()+1,f.getYp()-1)!=null&&
				gf.buscarFicha(f.getXp()+1,f.getYp()-1).esRoja()!=f.esRoja()&&
					gf.buscarFicha(f.getXp()+2,f.getYp()-2)==null&&
						f.getCorona()&&f.getXp()<7&&f.getYp()>2)
						m.add(new Movimiento(f,f.getXp()+2,f.getYp()-2));
			
			if(gf.buscarFicha(f.getXp()-1,f.getYp()-1)!=null&&
				gf.buscarFicha(f.getXp()-1,f.getYp()-1).esRoja()!=f.esRoja()&&
					gf.buscarFicha(f.getXp()-2,f.getYp()-2)==null&&
						f.getCorona()&&f.getXp()>2&&f.getYp()>2)
						m.add(new Movimiento(f,f.getXp()-2,f.getYp()-2));
		}
		}else{
			if(!gf.puedeComer(f)){
			if(gf.buscarFicha(f.getXp()+1,f.getYp()-1)==null&&f.getXp()<8&&f.getYp()>1)
				m.add(new Movimiento(f,f.getXp()+1,f.getYp()-1));
				
			if(gf.buscarFicha(f.getXp()-1,f.getYp()-1)==null&&f.getXp()>1&&f.getYp()>1)
				m.add(new Movimiento(f,f.getXp()-1,f.getYp()-1));
				
			if(gf.buscarFicha(f.getXp()+1,f.getYp()+1)==null&&f.getCorona()&&f.getXp()!=8&&
				f.getYp()!=8)
				m.add(new Movimiento(f,f.getXp()+1,f.getYp()+1));
				
			if(gf.buscarFicha(f.getXp()-1,f.getYp()+1)==null&&f.getCorona()&&f.getXp()>1&&f.getYp()<8)
				m.add(new Movimiento(f,f.getXp()-1,f.getYp()+1));
				
		}else
		{
			if(gf.buscarFicha(f.getXp()+1,f.getYp()-1)!=null&&
				gf.buscarFicha(f.getXp()+1,f.getYp()-1).esRoja()!=f.esRoja()&&
					gf.buscarFicha(f.getXp()+2,f.getYp()-2)==null&&f.getXp()<7&&f.getYp()>2)
						m.add(new Movimiento(f,f.getXp()+2,f.getYp()-2));
				
			if(gf.buscarFicha(f.getXp()-1,f.getYp()-1)!=null&&
				gf.buscarFicha(f.getXp()-1,f.getYp()-1).esRoja()!=f.esRoja()&&
					gf.buscarFicha(f.getXp()-2,f.getYp()-2)==null&&f.getXp()>2&&f.getYp()>2)
						m.add(new Movimiento(f,f.getXp()-2,f.getYp()-2));
						
			if(gf.buscarFicha(f.getXp()+1,f.getYp()+1)!=null&&
				gf.buscarFicha(f.getXp()+1,f.getYp()+1).esRoja()!=f.esRoja()&&
					gf.buscarFicha(f.getXp()+2,f.getYp()+2)==null&&
						f.getCorona()&&f.getXp()<7&&f.getYp()<7)
						m.add(new Movimiento(f,f.getXp()+2,f.getYp()+2));
			
			if(gf.buscarFicha(f.getXp()-1,f.getYp()+1)!=null&&
				gf.buscarFicha(f.getXp()-1,f.getYp()+1).esRoja()!=f.esRoja()&&
					gf.buscarFicha(f.getXp()-2,f.getYp()+2)==null&&
						f.getCorona()&&f.getXp()>2&&f.getYp()<7)
						m.add(new Movimiento(f,f.getXp()-2,f.getYp()+2));
		}
		}
		
		mov = new Movimiento[m.size()];
		
		for(int i=0; i<mov.length; i++)
			mov[i] = m.get(i);
			
		return mov;
	}
	
	public Movimiento[] getMovimientos(){
		Movimiento[] m = new Movimiento[n];
		Movimiento temp = inicio;
		int i = 0;
		while(temp!=null){
			m[i++] = temp;
			temp = temp.getNext();
		}
		return m;
	}
	
	
}