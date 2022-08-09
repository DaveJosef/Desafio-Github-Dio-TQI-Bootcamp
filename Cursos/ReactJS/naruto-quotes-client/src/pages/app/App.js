import { useEffect, useRef, useState } from "react";
import styled from "styled-components";
import { Quotes } from "../../components/quotes/Quotes";
import { getQuote } from "../../services";
import narutoImg from '../../images/naruto.png';
import jutsoSound from '../../sounds/jutso.mp3';

const audio = new Audio(jutsoSound);

export function App() {
  const isMounted = useRef(true);
  const [quote, setQuote] = useState({
    speaker: 'Loading speaker...',
    quote: 'Loading Quote'
  });

  const onUpdate = async () => {
    const resQuote = await getQuote();
    
    if (isMounted.current) {
      setQuote(resQuote);
      audio.play();
    }
  }
  
  useEffect(() => {
    onUpdate();

    return () => {
      isMounted.current = false;
    };
  }, []);

  return (
    <Content>
      <Quotes {...quote} onUpdate={onUpdate} />
      <NarutoImg alt="Naruto holding a kunai" src={narutoImg} />
    </Content>
  );
}

const Content = styled.div``;

const NarutoImg = styled.img``;
