package edu.stanford.cs.crypto.efficientct;

import cyclops.collections.immutable.VectorX;
import edu.stanford.cs.crypto.efficientct.commitments.PeddersenCommitment;
import edu.stanford.cs.crypto.efficientct.linearalgebra.GeneratorVector;
import edu.stanford.cs.crypto.efficientct.rangeproof.RangeProof;

import java.math.BigInteger;
import java.util.Optional;

/**
 * Created by buenz on 6/29/17.
 */
public interface Prover<PP, I, W, P> {
    default P generateProof(PP parameter, I input, W witness, BigInteger salt) {
        return generateProof(parameter, input, witness, Optional.of(salt));
    }

    default P generateProof(PP parameter, I input, W witness) {
        return generateProof(parameter, input, witness, Optional.empty());
    }

    P generateProof(PP parameter, I input, W witness, Optional<BigInteger> salt);

}
