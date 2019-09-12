/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games.pathfinding.heuristics;

import br.cefetmg.games.pathfinding.TileNode;
import com.badlogic.gdx.ai.pfa.Heuristic;
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author aluno
 */
public class SquaredDist implements Heuristic<TileNode>{

    
    private int tileWidth;
    
    public SquaredDist(int tileWidth){
        this.tileWidth = tileWidth;
    }

    @Override
    public float estimate(TileNode n, TileNode n1) {
        return Vector2.dst(n.getPosition().x, n.getPosition().y, n1.getPosition().x, n1.getPosition().y)/this.tileWidth;
        
    }
    
}
