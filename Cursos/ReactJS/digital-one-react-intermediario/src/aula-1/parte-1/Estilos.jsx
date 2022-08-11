import React from 'react';
import CLassName from './componentes/CLassName';
import Inline from './componentes/Inline';
import Styled from './componentes/Styled';

const Estilos = () => (
    <div style={{display: 'flex', justifyContent: 'space-around'}}>
      <Inline />
      <CLassName />
      <Styled />
    </div>
);

export default Estilos;
