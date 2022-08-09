import { useEffect, useRef, useState } from "react";
import styled from "styled-components";
import { Quotes } from "../../components/quotes/Quotes";
import narutoImg from '../../images/naruto.png';

export function App() {
  const isMounted = useRef(true);
  const [quote, setQuote] = useState({
    speaker: 'Loading speaker...',
    quote: 'Loading Quote'
  });

  const onUpdate = async () => {
    const resQuote = {
      speaker: 'Loading speaker...',
      quote: 'Loading Quote'
    };
    
    if (isMounted.current) {
      setQuote(resQuote);
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
