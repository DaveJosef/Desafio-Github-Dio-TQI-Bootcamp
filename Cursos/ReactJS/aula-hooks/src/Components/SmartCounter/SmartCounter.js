import { useState } from 'react';
import React from 'react';

export default function SmartCounter() {
    const [quantity, upQuantity] = useState(1);

  return (
    <>
        <h1>{ quantity }</h1>
        <button onClick={() => upQuantity(quantity + 1)} >Aumentar</button>
    </>
  )
};
