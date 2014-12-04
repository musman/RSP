package service.workflow;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import service.composite.CompositeService;
import service.composite.SDCache;
import service.workflow.ast.ASTNode.Start;
import service.workflow.ast.rspLexer;
import service.workflow.ast.rspParser;
import taskgraph.TaskGraph.START;
import taskgraph.TaskGraphInterpreter;

public class WorkflowEngine {

    CompositeService service;
    SDCache sdCache;

    public WorkflowEngine(CompositeService service, SDCache cache) {
	this.service = service;
	this.sdCache = cache;
    }

    public Object executeWorkflow(String workFlow, AbstractQoSRequirement qosRequirement, Object... parameters) {
	rspLexer lexer;
	try {
	    lexer = new rspLexer(new ANTLRFileStream(workFlow));
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    rspParser parser = new rspParser(tokens);

	    // Get AST root
	    Start start = (Start) parser.start().getTree();

	    // ASTSymTabVisualizer astVisualizer = new ASTSymTabVisualizer();
	    // astVisualizer.exportGML(workFlow + "_AST", start);

	    START startGraph = (START) start.getFirst();
	    // TaskGraphVisualizer tgVisualizer = new TaskGraphVisualizer();
	    // tgVisualizer.exportGML(workFlow + "_TaskGraph", startGraph);

	    TaskGraphInterpreter interpreter = new TaskGraphInterpreter();
	    Object value = interpreter.interpret(startGraph, sdCache, qosRequirement, service, parameters);
	    System.out.println("Result:" + value);
	    return value;
	} catch (IOException | RecognitionException e) {
	    e.printStackTrace();
	    return null;
	}
    }

}
