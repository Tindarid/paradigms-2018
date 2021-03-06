package expression;

import expression.exceptions.EvaluationException;
import expression.type.Type;

public interface TripleExpression<T extends Number> {
    Type<T> evaluate(Type<T> x, Type<T> y, Type<T> z) throws EvaluationException;
}
