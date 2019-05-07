// Copyright 2010-2018 Google LLC
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ortools.sat;

/** A linear expression interface that can be parsed. */
public final class ScalProd implements LinearExpr {
  private final IntVar[] variables;
  private final long[] coefficients;

  public ScalProd(IntVar[] variables, long[] coefficients) {
    this.variables = variables;
    this.coefficients = coefficients;
  }

  @Override
  public int numElements() {
    return variables.length;
  }

  @Override
  public IntVar getVariable(int index) {
    return variables[index];
  }

  @Override
  public long getCoefficient(int index) {
    return coefficients[index];
  }
}