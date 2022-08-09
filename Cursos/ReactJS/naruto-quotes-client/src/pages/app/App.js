import styled from "styled-components";
import narutoImg from '../../images/naruto.png';

export function App() {
  return (
    <Content>
      <div>App</div>
      <NarutoImg alt="Naruto holding a kunai" src={narutoImg} />
    </Content>
  );
}

const Content = styled.div``;

const NarutoImg = styled.img``;
