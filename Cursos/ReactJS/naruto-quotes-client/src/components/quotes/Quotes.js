import styled from "styled-components";
import { string, func } from 'prop-types';

export const Quotes = ({ quote, speaker, onUpdate = () => {} }) => {

    return (
        <Wrapper>
            <Quote>"{quote}"</Quote>
            <Speaker>- {speaker}</Speaker>
            <button onClick={onUpdate}>Quote No Jutsu</button>
        </Wrapper>
    );
}

Quotes.propTypes = {
    quote: string,
    speaker: string,
    onUpdate: func,
};

const Wrapper = styled.div``;

const Quote = styled.p``;

const Speaker = styled(Quote)``;
